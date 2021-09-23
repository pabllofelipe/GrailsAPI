package grailsapi


import grails.rest.*
import grails.converters.*

class StudentController {
	static responseFormats = ['json', 'xml']
    def studentService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index() {
        respond studentService.list()
    }

    def show(Long id) {
        respond studentService.get(id)
    }

    def create() {
        respond new Student(params)
    }

    def save(Student student) {
        def debug = studentService.save(student)
        redirect action:"index", method:"GET"
    }

    def delete(Long id) {
        studentService.delete(id)
        redirect action:"index", method:"GET"
    }
}
