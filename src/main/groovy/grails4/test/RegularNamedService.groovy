package grails4.test

import groovy.transform.CompileStatic

import javax.inject.Named
import javax.inject.Singleton

@Named('regular')
@Singleton
@CompileStatic
class RegularNamedService implements NamedService {

    final String name = 'regular'
    
}
