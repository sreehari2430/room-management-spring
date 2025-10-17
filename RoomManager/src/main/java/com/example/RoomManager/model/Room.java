package com.example.RoomManager.model;

enum RoomType {
      SINGLE,
      DOUBLE,
      SUITE
}

public class Room {
      private int roomNumber;
      private RoomType roomType;
      private double price;
      private boolean booked;

      public Room(int roomNumber, RoomType roomType, double price) {
            this.roomNumber = roomNumber;
            this.roomType = roomType;
            this.price = price;
            this.booked = false;
            }

      public Room(int roomNumber) {
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