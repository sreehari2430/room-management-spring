package com.example.RoomManager.service;

import com.example.RoomManager.model.Room;
import java.util.List;

public interface RoomService {
    void addRoom(int roomNumber);
    void removeRoom(int roomNumber);
    boolean bookRoom(int roomNumber);
    List<Room> getAllRooms();
}