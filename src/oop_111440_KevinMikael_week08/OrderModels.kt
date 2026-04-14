package oop_111440_KevinMikael_week08

class City(val name: String)
class Address(val city: City?)
class DeliveryDetails(val address: Address)
class Order(val deliveryDetails: DeliveryDetails?, val totalPrice: Int?)