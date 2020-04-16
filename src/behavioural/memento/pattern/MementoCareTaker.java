package behavioural.memento.pattern;

import java.util.Stack;

public class MementoCareTaker {

	private Stack<ShirtDesignMemento> mementoStack = new Stack<>();

	public void pushMemento(ShirtDesignMemento memento) {

		mementoStack.push(memento);
	}

	public ShirtDesignMemento popMemento() {
		return mementoStack.pop();
	}

}
