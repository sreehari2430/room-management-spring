package com.example.RoomManager.model;

public class Room {
    private int roomNumber;
    private boolean booked;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.booked = false;
    }

    public int getRoomNumber() { return roomNumber; }
    public boolean isBooked() { return booked; }
    public void setBooked(boolean booked) { this.booked = booked; }

    @Override
    public String toString() {
        return "Room{" + "roomNumber=" + roomNumber + ", booked=" + booked + '}';
    }
}