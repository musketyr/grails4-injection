package grails4.test

import groovy.transform.CompileStatic

import javax.inject.Named
import javax.inject.Singleton

@Qualified
@Singleton
@CompileStatic
class QualifiedNamedService implements NamedService {

    final String name = 'qualified'
    
}
