package jp.ac.uryukyu.ie.e195728;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test
    void attacktest(){
        Warrior demoWarrior = new Warrior("デモ戦士",50,20);
        Enemy slime = new Enemy("スライムもどき",100,20);
        for(int i=0;i<3;i++){
        demoWarrior.attackWithWeponSkill(slime);
        assertEquals(30,(int)(1.5* demoWarrior.getAttack()));
    }

}

}
