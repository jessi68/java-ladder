package ladder.domain;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * Ladder Tester.
 *
 * @author jessi68
 * @since <pre>1월 23, 2021</pre>
 * @version 1.0
 */
public class LaddersTest {

    Ladders ladders = null;

    @Before
    public void before() throws Exception {
        ladders = null;
    }

    @Test
    public void makeLadders() {
        ladders = new Ladders();
    }

    @After
    public void after() throws Exception {
    }

}

