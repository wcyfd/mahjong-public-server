package com.randioo.mahjong_public_server.module.fight.action;

import org.apache.mina.core.session.IoSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.google.protobuf.GeneratedMessage;
import com.randioo.mahjong_public_server.entity.bo.Role;
import com.randioo.mahjong_public_server.module.fight.service.FightService;
import com.randioo.mahjong_public_server.protocol.Fight.FightExitGameRequest;
import com.randioo.randioo_server_base.annotation.PTAnnotation;
import com.randioo.randioo_server_base.cache.RoleCache;
import com.randioo.randioo_server_base.template.IActionSupport;
import com.randioo.randioo_server_base.utils.SessionUtils;

@Controller
@PTAnnotation(FightExitGameRequest.class)
public class FightExitAction implements IActionSupport {

	@Autowired
	private FightService fightService;
	
	@Override
	public void execute(Object data, IoSession session) {
		FightExitGameRequest request = (FightExitGameRequest) data;
		Role role = (Role) RoleCache.getRoleBySession(session);
		GeneratedMessage sc = fightService.exitGame(role);
		SessionUtils.sc(role.getRoleId(), sc);
	}

}