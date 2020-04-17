package behavioural.visitor.pattern;

public interface Visitor {
	
	
	int visit(Book book);
	
	int visit(Phone phone);
	
	int visit(Shirt shirt);

}
