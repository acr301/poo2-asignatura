package ej3

class Bus {
    var route: Int = 0
    var capacity: Int = 0
    var driver: String = ""

    fun initializeRoute(route: Int, capacity: Int, driver: String) {
        this.route = route
        this.capacity = capacity
        this.driver = driver
    }
}