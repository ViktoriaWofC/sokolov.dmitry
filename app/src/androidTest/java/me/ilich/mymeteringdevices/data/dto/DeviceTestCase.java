package me.ilich.mymeteringdevices.data.dto;

import junit.framework.TestCase;

public class DeviceTestCase extends TestCase {

    public void testEquals() {
        Device device1 = new Device(1, "dev1", 1);
        Device device2 = new Device(1, "dev1", 1);
        Device device3 = new Device(2, "dev2", 2);
        assertEquals(device1, device2);
        assertNotSame(device1, device3);
    }

}
