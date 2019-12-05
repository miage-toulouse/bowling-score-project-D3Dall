package miage.fdel.bowling;

import org.junit.Test;

import static org.junit.Assert.*;

public class JeuTest {

    @Test
    public void testJeuEstValide(){
        assertTrue(new Jeu(new Essaie(1), new Essaie(3)).isValid());
        assertTrue(new Jeu(new Essaie(5), new Essaie(5)).isValid());
        assertTrue(new Jeu(new Essaie(10)).isValid());
    }

    @Test
    public void testJeuEstInvalide(){
        assertFalse(new Jeu(null, null).isValid());
        assertFalse(new Jeu(null, new Essaie(3)).isValid());
        assertFalse(new Jeu(new Essaie(3)).isValid());
        assertFalse(new Jeu(new Essaie(5), new Essaie(8)).isValid());
    }

}