package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	ImmutableArrayListTest.class,
	    ImmutableLinkedListTest.class,
	    ImmutableReversedArrayListTest.class,
	    DoubleLinkedListProxyTest.class
	    })
public class AllTests {

}
