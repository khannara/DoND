package com.ktx.game.dealornodeal;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

/**
 * parameters
 * return
 */
public class SuitCaseFactoryTest {
    SuitCaseFactory suitCaseFactory = new SuitCaseFactory();

    @Before
    public void initSuitCaseFactory() throws Exception {
        suitCaseFactory.init();
    }

    @Test
    public void testInit() throws Exception {
        Assert.assertSame(26, suitCaseFactory.getAllSuitCases().size());
        Assert.assertSame(1, suitCaseFactory.getSuitCase(1).value());
    }

    @Test
    public void testShuffle() throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 30; i++) {
            list.add(i);
        }
        SuitCaseFactory.shuffle(list);
        Iterator<Integer> iterator = list.iterator();
        Assert.assertNotSame(1, iterator.next());
        Assert.assertNotSame(2, iterator.next());
        Assert.assertNotSame(3, iterator.next());
        Assert.assertNotSame(4, iterator.next());
        Assert.assertNotSame(5, iterator.next());
        Assert.assertNotSame(6, iterator.next());
        Assert.assertNotSame(7, iterator.next());
        Assert.assertNotSame(8, iterator.next());
        Assert.assertNotSame(9, iterator.next());
        Assert.assertNotSame(10, iterator.next());
        Assert.assertNotSame(11, iterator.next());
        Assert.assertNotSame(12, iterator.next());
        Assert.assertNotSame(13, iterator.next());
        Assert.assertNotSame(14, iterator.next());
        Assert.assertNotSame(15, iterator.next());
        Assert.assertNotSame(16, iterator.next());
        Assert.assertNotSame(17, iterator.next());
        Assert.assertNotSame(18, iterator.next());
        Assert.assertNotSame(19, iterator.next());
        Assert.assertNotSame(20, iterator.next());
        Assert.assertNotSame(21, iterator.next());
        Assert.assertNotSame(22, iterator.next());
        Assert.assertNotSame(23, iterator.next());
        Assert.assertNotSame(24, iterator.next());
        Assert.assertNotSame(25, iterator.next());
        Assert.assertNotSame(26, iterator.next());
        Assert.assertNotSame(27, iterator.next());
        Assert.assertNotSame(28, iterator.next());
        Assert.assertNotSame(29, iterator.next());
        Assert.assertNotSame(30, iterator.next());
    }


    @Test
    public void testGetSuitCase() throws Exception {
        Assert.assertSame(1, suitCaseFactory.getSuitCase(1).id());
        Assert.assertSame(2, suitCaseFactory.getSuitCase(2).id());
        Assert.assertSame(3, suitCaseFactory.getSuitCase(3).id());
        Assert.assertSame(4, suitCaseFactory.getSuitCase(4).id());
    }
}
