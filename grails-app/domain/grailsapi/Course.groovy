package grailsapi

class Course {
    String name
    static hasMany = [student : Student]
    static constraints = {
    }
}
