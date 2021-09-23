package grailsapi

class Student {
    String firstName
    String lastName
    static belongsTo = [course: Course]
    static constraints = {
        course(nullable: true)
    }
}
