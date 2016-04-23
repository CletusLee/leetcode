package test.groovy.spock

import spock.lang.*

class Publisher {
	def subscribers = []
	
	def send(event) {
		subscribers.each {
			try {
				it.receive(event)
			} catch (Exception e) {}
		}
	}
}

interface Subscriber {
	def receive(event)
}

