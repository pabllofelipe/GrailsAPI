package grailsapi


import grails.rest.*
import grails.converters.*
import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class CourseController {
	static responseFormats = ['json', 'xml']
    def courseService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index() {
        respond courseService.list()
    }

    def show(Long id) {
        respond courseService.get(id)
    }

    def create() {
        respond new Course(params)
    }

    def save(Course course) {
        courseService.save(course)
        redirect action:"index", method:"GET"
    }

    def delete(Long id) {
        courseService.delete(id)
        redirect action:"index", method:"GET"
    }
}