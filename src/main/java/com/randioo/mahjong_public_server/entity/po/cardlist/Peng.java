package com.randioo.mahjong_public_server.entity.po.cardlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.randioo.mahjong_public_server.entity.po.CardSort;

/**
 * 三个相同
 * 
 * @author wcy 2017年6月12日
 *
 */
public class Peng extends AbstractCardList {
	public int card;

	@Override
	public void check(List<CardList> cardLists, CardSort cardSort, int card,List<CardList> showCardList,boolean isMine) {
		if (card == 81)
			return;
		
		Set<Integer> set = cardSort.getList().get(2);
		if (set.contains(card)) {
			Peng peng = new Peng();
			peng.card = card;
			cardLists.add(peng);
		}
	}

	@Override
	public List<Integer> getCards() {
		List<Integer> list = new ArrayList<>(3);
		for (int i = 0; i < 3; i++)
			list.add(card);
		return list;
	}

	@Override
	public String toString() {
		return "cardList=>peng:card=" + card + " " + super.toString();
	}

}
