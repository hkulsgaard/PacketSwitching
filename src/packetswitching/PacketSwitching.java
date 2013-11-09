package packetswitching;

import java.io.IOException;

public class PacketSwitching {

    public static void main(String[] args) throws IOException {
 
        FileConfig file = new FileConfig();
        NetworkSimulator _ns = file.loadFromFile("network.txt");
        _ns.simulate();
    }
}
