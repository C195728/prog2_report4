package jp.ac.uryukyu.ie.e195728;


/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing {


    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String name, int maximumHP, int attack) {
        super(name,maximumHP,attack);
    }
    /**
     * privateでカプセル化されたフィールド変数の値を参照するためのメソッド。
     * String型のnameを受け取る。
     * @return name 
     */

    /**
     * privateでカプセル化されたフィールド変数の値を参照するためのメソッド。
     * int型のhitPointを受け取る。
     * @return hitPoint 
     */

    /**
     * privateでカプセル化されたフィールド変数の値を参照するためのメソッド。
     * int型のattackを受け取る。
     * @return attack 
     */

    /**
     * privateでカプセル化されたフィールド変数の値を参照するためのメソッド。
     * boolean型のdeadを受け取る。
     * @return dead
     */

    /**
     * privateでカプセル化されたフィールド変数に値を設定するためのメソッド。
     * @param dead privateになっているboolean型のパラメータ
     */

    /**
     * Enemyへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param e 攻撃対象
     */


    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(String name,int damage){
        System.out.printf("勇者%sは道半ばで力尽きてしまった。\n",name);
    }
}