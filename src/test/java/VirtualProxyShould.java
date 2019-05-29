import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class VirtualProxyShould {

    private DemoSubject virtualProxy;

    @BeforeEach
    void setUp() {
        virtualProxy = new VirtualProxy(1, 2);
    }

    @Test
    void not_create_subject_before_needed() {
        assertEquals(null, ((VirtualProxy) virtualProxy).demoSubject);
    }

    @Test
    void allow_access_to_basic_information_before_instantiation() {
        assertEquals(1, ((VirtualProxy) virtualProxy).subjectDataA);
        assertEquals(2, ((VirtualProxy) virtualProxy).subjectDataB);
    }

    @Test
    void create_the_real_object_on_demand() {
        virtualProxy.doSomethingExpensive();
        assertNotEquals(null, ((VirtualProxy)virtualProxy).demoSubject);
    }
}
