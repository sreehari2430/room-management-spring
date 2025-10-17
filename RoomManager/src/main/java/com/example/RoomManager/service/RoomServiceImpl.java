package com.example.RoomManager.service;

import com.example.RoomManager.model.Room;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

@Service
public class RoomServiceImpl implements RoomService {

    private HashMap<Integer, Room> rooms = new HashMap<>();

    @Override
    public void addRoom(int roomNumber) {
        if (!rooms.containsKey(roomNumber)) {
            rooms.put(roomNumber, new Room(roomNumber));
        }
    }

    @Override
    public void removeRoom(int roomNumber) {
        rooms.remove(roomNumber);
    }

    @Override
    public boolean bookRoom(int roomNumber) {
        Room room = rooms.get(roomNumber);
        if (room != null && !room.isBooked()) {
            room.setBooked(true);
            return true;
        }
        return false;
    }

    @Override
    public List<Room> getAllRooms() {
        return new ArrayList<>(rooms.values());
    }
}