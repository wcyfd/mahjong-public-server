package com.randioo.mahjong_public_server.util;

public class CardTools {
	public static final int TONG = 1;
	public static final int TIAO = 2;
	public static final int WAN = 3;
	public static final int ZHONG = 8;

	public final static int[] CARDS = { 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 筒
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 筒
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 筒
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 筒

			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 条
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 条
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 条
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 条

			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, // 万
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, // 万
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, // 万
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, // 万
			// 0x41, 0x41, 0x41, 0x41,// 东
			// 0x51, 0x51, 0x51, 0x51,// 南
			// 0x61, 0x61, 0x61, 0x61,// 西
			// 0x71, 0x71, 0x71, 0x71,// 北
			0x81, 0x81, 0x81, 0x81,// 中
			// 0x91, 0x91, 0x91, 0x91,// 发
			// 0xA1, 0xA1, 0xA1, 0xA1,// 白
			// 0xB1,// 梅
			// 0xB2,// 兰
			// 0xB3,// 竹
			// 0xB4,// 菊
			// 0xB5,// 春
			// 0xB6,// 夏
			// 0xB7,// 秋
			// 0xB8,// 冬
			// 0xB9,// 财神
			// 0xBA,// 猫
			// 0xBB,// 老鼠
			// 0xBC,// 聚宝盆
			// 0xC1,// 白搭
			// 0xC1,// 白搭
			// 0xC1,// 白搭
			// 0xC1,// 白搭
	};

	/**
	 * 去掉花色
	 * 
	 * @param pai
	 * @return
	 * @author wcy 2017年5月27日
	 */
	public static int toNum(int pai) {
		return pai & 0x0F;
	}

	public static int getType(int pai) {
		return pai & 0xF0 >> 4;
	}

}
