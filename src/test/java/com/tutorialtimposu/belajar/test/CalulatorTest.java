package com.tutorialtimposu.belajar.test;

import com.tutorialtimposu.belajar.test.generator.SimpleDisplayNameGenerator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayName("Test untuk Calculator")
@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
public class CalulatorTest {

    private Calculator calculator = new Calculator();

    // @BeforeAll dan @AfterAll hanya dieksekusi satu
    // kali saja di awal dan akhir class Test tetapi syaratnya
    // method harus static
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }

    // @BeforeEach dan @AfterEach akan dieksekusi pada semua
    // method @Test
    @BeforeEach
    public void setUp() {
        System.out.println("Before Each");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("After Each");
    }

    @Test
//    @DisplayName("Test Skenario sukses untuk methid add(integer, integer)")
    public void testAddSuccess() {
        Integer result = calculator.add(10, 10);

        // cara ini ribet
//        if (result != 20) {
//            throw new RuntimeException("test gagal");
//        }

        // cara yang direkomendasikan
        assertEquals(20, result);
    }

    @Test
//    @DisplayName("Test Skenario throw exception yang diinginkan (tidak error)")
    public void testDivideSuccess() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.devide(100, 0);
        });
    }

    @Test
    @Disabled
    public void commingSoon() {

    }
}
