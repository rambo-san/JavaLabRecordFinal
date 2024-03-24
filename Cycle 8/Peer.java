import java.io.*;
import java.net.*;

public class Peer {
    private DatagramSocket socket;
    private InetAddress address;
    private int port;

    public Peer(String ipAddress, int port) throws SocketException, UnknownHostException {
        this.socket = new DatagramSocket();
        this.address = InetAddress.getByName(ipAddress);
        this.port = port;
    }

    public void sendMessage(String message) throws IOException {
        byte[] buffer = message.getBytes();
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, port);
        socket.send(packet);
    }

    public void receiveMessage() throws IOException {
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        socket.receive(packet);
        String received = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Received: " + received);
    }

    public void close() {
        socket.close();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter peer IP address: ");
        String ipAddress = stdIn.readLine();
        System.out.print("Enter peer port number: ");
        int port = Integer.parseInt(stdIn.readLine());

        Peer peer = new Peer(ipAddress, port);

        Thread receiveThread = new Thread(() -> {
            try {
                while (true) {
                    peer.receiveMessage();
                }
            } catch (IOException e) {
                System.out.println("Error receiving message: " + e.getMessage());
            }
        });

        receiveThread.start();

        System.out.println("Enter messages to send (type 'exit' to quit):");
        String userInput;
        while (!(userInput = stdIn.readLine()).equals("exit")) {
            peer.sendMessage(userInput);
        }

        peer.close();
        receiveThread.interrupt();
    }
}
