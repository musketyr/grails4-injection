package grails4.test

import grails.compiler.GrailsCompileStatic
import grails.converters.JSON

import javax.inject.Inject
import javax.inject.Named

@GrailsCompileStatic
class TestController {

    NamedService namedService1

    @Inject
    List<NamedService> namedServices

    @Inject
    @Named('regular')
    NamedService namedService2

    @Inject
    @Named('special')
    NamedService namedService3

//    @Inject
//    @Qualified
//    NamedService namedService4

    def injection() {
        render([
                one  : namedService1?.name,
                two  : namedService2.name,
                three: namedService3.name,
                // four : namedService4.name,
                all  : namedServices*.name
        ] as JSON)
    }

}
