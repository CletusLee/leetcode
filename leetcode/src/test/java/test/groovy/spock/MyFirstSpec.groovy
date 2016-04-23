package test.groovy.spock

import spock.lang.*

class MyFirstSpec extends Specification{
	def "max of two numbers"() {
		expect:
		Math.max(1,2) == 2
	}
	
	def 'max method on a list works'() {
		expect:
		[3,1,2,3,5,6,9].max() == 9
	}
	
	@Unroll
	def 'using list of pairs (#name,#length)'(String name, int length) {
		expect:
		name.size() == length
		
		where:
		[name, length] << [['Spock', 5], ['Kirk', 4], ['Scotty', 6]]
	}

}
