package casainteligente;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.*;
import java.util.ArrayList;


public class CasaInteligente{
    private String morada;
    private Map<String, SmartDevice> devices;
    private Map<String, List<String>> lista;
    
    //Construtores
    public CasaInteligente(){
        this.morada = "";
        this.devices = new HashMap<>();
        this.lista = new HashMap<>();
    }

    public CasaInteligente(String morada)
    {
        this.morada = morada;
        this.devices = new HashMap<>();
        this.lista = new HashMap<>();
    }
    
    
    //Getters e Setters
    public SmartDevice getDevice(String id){
        return this.devices.get(id);
    }

    public void setAllOn(boolean on){
        this.devices.forEach((k, v) -> v.setOn(on));
    }
    
    
    public boolean roomHasDevice(String room, String id){
        List<String> list = this.lista.get(room);
        if(list != null) return list.contains(id);
        return false;
    }
    
    //Metodos     
    public void addToRoom(String room, String id){
        List<String> list = this.lista.get(room);
        if(list != null) list.add(id);
    }
    
    public boolean hasRoom(String room){
        return this.lista.containsKey(room);
    }
    
    public boolean existsDevice(String id){
        return this.devices.containsKey(id);
    }
    
    
    public void addRoom(String room){
        List<String> l = new ArrayList<String>();
        this.lista.putIfAbsent(room, l);
    }
    
    public void addDevice (SmartBulb bulb) {
        SmartDevice aux = new SmartBulb (bulb.getID(), bulb.getTone());
        this.devices.put(aux.getID(), aux);
    }    
    
    public void addDevice (SmartSpeaker speaker) {
        SmartDevice aux = new SmartSpeaker(speaker.getID(), speaker.getChannel(), speaker.getVolume());
        this.devices.put(aux.getID(), aux);
    }
}