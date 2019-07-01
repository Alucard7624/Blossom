package com.csy.app.view;

import com.csy.app.model.BlossomModel;

public class BlossomView {
	public static void main() {
		//1.欢迎语
		System.out.println("欢迎使用世纪金花App");
		//2.展示用户的手牌
		int[] userCards=user();
		//3.展示电脑的手牌
		int[] computerCards=computer();
		//6.比较双方手牌大小
		if(BlossomModel.compaire(userCards, computerCards)==1) {
			System.out.println("You Win!");
		}else if(BlossomModel.compaire(userCards, computerCards)==-1){
			System.out.println("You Lose!");
		}else if(BlossomModel.compaire(userCards, computerCards)==0){
			System.out.println("平局!");
		}
	}
	
	
	public static int[] user() {
		//2.获取porker牌
		int[] Porker=BlossomModel.porker();
		//3.洗牌
		BlossomModel.shuffle(Porker);
		int[] userCards=BlossomModel.subArray(Porker, 0, 3);
		String cardsDesc=BlossomModel.getCardsDescription(userCards);
		System.out.println("你的手牌是:"+cardsDesc);
		int userType=BlossomModel.cardType(userCards);
		String userTypeDesc=BlossomModel.getCardTypeDescription(userType);
		System.out.println("你的牌型是:"+userTypeDesc);
		return userCards;
	}
	
	public static int[] computer() {
		//2.获取porker牌
		int[] Porker=BlossomModel.porker();
		BlossomModel.shuffle(Porker);
		int[] computerCards=BlossomModel.subArray(Porker, 0, 3);
		String computerCardsDesc=BlossomModel.getCardsDescription(computerCards);
		System.out.println("电脑的手牌是:"+computerCardsDesc);
		int computerType=BlossomModel.cardType(computerCards);
		String computerTypeDesc=BlossomModel.getCardTypeDescription(computerType);
		System.out.println("电脑的牌型是:"+computerTypeDesc);
		return computerCards;
	}
	
}
