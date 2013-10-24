package packetswitching;

public class PacketSwitching {

    public static void main(String[] args) {
        NetworkSimulator _ns = new NetworkSimulator();
        _ns.inic();
        
        
        _ns.simulate();
    }
}
