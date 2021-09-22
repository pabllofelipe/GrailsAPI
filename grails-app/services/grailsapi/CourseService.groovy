package grailsapi

import grails.gorm.transactions.Transactional

import javax.swing.CellRendererPane

@Transactional
class CourseService {

    def get(id){
        Course.get(id)
    }

    def list() {
        Course.list()
    }

    def save(course){
        Course.save()
    }

    def delete(id){
        Course.get(id).delete()
    }
}
