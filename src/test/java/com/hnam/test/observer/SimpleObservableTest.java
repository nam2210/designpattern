package com.hnam.test.observer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class SimpleObservableTest {

    @Test
    public void testObservable(){
        SimpleObservable observable = new SimpleObservable();
        SimpleObserver observer1 = Mockito.mock(SimpleObserver.class);
        CheeringObserver observer2 = Mockito.mock(CheeringObserver.class);

        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.notifyObservers();

        Mockito.verify(observer1).onDataAvailable(1);
        Mockito.verify(observer2).onDataAvailable(1);
    }

    @Test
    public void testObservableRemoveObserverCorrectly(){
        SimpleObservable observable = new SimpleObservable();
        SimpleObserver observer1 = Mockito.mock(SimpleObserver.class);
        CheeringObserver observer2 = Mockito.mock(CheeringObserver.class);

        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.notifyObservers();

        Mockito.verify(observer1).onDataAvailable(1);
        Mockito.verify(observer2).onDataAvailable(1);

        observable.removeObserver(observer2);
        Mockito.verify(observer1).onDataAvailable(1);
        Mockito.verifyNoMoreInteractions(observer2);
    }
}
