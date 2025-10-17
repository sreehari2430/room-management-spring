package com.example.RoomManager.controller;

import com.example.RoomManager.model.Room;
import com.example.RoomManager.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @PostMapping("/add/{roomNumber}")
    public String addRoom(@PathVariable int roomNumber) {
        roomService.addRoom(roomNumber);
        return "Room " + roomNumber + " added.";
    }

    @DeleteMapping("/remove/{roomNumber}")
    public String removeRoom(@PathVariable int roomNumber) {
        roomService.removeRoom(roomNumber);
        return "Room " + roomNumber + " removed.";
    }

    @PostMapping("/book/{roomNumber}")
    public String bookRoom(@PathVariable int roomNumber) {
        boolean success = roomService.bookRoom(roomNumber);
        if (success) return "Room " + roomNumber + " booked successfully.";
        return "Room " + roomNumber + " is already booked or does not exist.";
    }

    @GetMapping("/all")
    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }
}