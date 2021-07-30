System.out.println("戦艦ゲームスタート！");
public static ship(){
    int ship1HP=3;
    int ship2HP=3;
    int ship3HP=3;
}
System.out.println("爆弾を落とす座標を入力してね");

if(){
    System.out.pritnln("戦艦がダメージを受けた！");
    ship1HP--;
    ship2HP--;
    ship3HP--;
}else{
    System.out.println("攻撃が外れてしまった！");
}
if(ship1HP==0){
    System.out.println("ship1:撃沈！");
}else if(ship2HP==0){
    System.out.println("ship2:撃沈！");
}else if(ship3==0){
    System.out.println("ship3:撃沈！");
}else{
    System.out.println("ship1は生きてる！");
    System.out.println("ship2は生きてる！");
    System.out.println("ship3は生きてる！");
}