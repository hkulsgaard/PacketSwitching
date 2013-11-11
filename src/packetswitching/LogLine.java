package packetswitching;
    
class LogLine{
    int _time;
    String _evento;
    String _sender;
    String _receiver;
    String _packetId;
    String _packetSize;

    public LogLine(int time, String evento, String sender, String receiver, String packetId, String packetSize)
    {
        _time = time;
        _evento = evento;
        _sender = sender;
        _receiver = receiver;
        _packetId = packetId;
        _packetSize = packetSize;
    }
}
