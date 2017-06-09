package com.randioo.mahjong_public_server.module.match.service;

import com.google.protobuf.GeneratedMessage;
import com.randioo.mahjong_public_server.entity.bo.Game;
import com.randioo.mahjong_public_server.entity.bo.Role;
import com.randioo.mahjong_public_server.entity.po.RoleGameInfo;
import com.randioo.mahjong_public_server.protocol.Entity.GameConfig;
import com.randioo.randioo_server_base.service.ObserveBaseServiceInterface;

public interface MatchService extends ObserveBaseServiceInterface {
	/**
	 * 创建游戏
	 * 
	 * @param role
	 * @return
	 * @author wcy 2017年5月25日
	 */
	public GeneratedMessage createRoom(Role role, GameConfig gameConfig);

	/**
	 * 加入游戏
	 * 
	 * @param role
	 * @param lockString
	 * @return
	 * @author wcy 2017年5月25日
	 */
	public GeneratedMessage joinGame(Role role, String lockString);

	/**
	 * 获得游戏玩家标识符
	 * 
	 * @param gameId
	 * @param roleId
	 * @return
	 * @author wcy 2017年5月25日
	 */
	String getGameRoleId(int gameId, int roleId);

	GeneratedMessage match(Role role);

	void matchAI(Role role);

	Role getRoleFromRoleGameInfo(RoleGameInfo info);

	Game createGame(int roleId, GameConfig gameConfig);

	Game createGameByGameConfig(GameConfig gameConfig);

}