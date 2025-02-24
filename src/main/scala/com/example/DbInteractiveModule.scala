package com.example

trait DbInteractiveModule {
  def addHotel(hotelId: Int, hotel: Hotel): Unit
  def deleteHotel(hotelId: Int): Unit
  def getShortInfAboutHotels(cityId: Int): ShortInfAboutHotels
  def getHotel(hotelId: Int): Hotel
}