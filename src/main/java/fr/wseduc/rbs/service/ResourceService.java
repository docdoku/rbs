package fr.wseduc.rbs.service;

import org.entcore.common.service.CrudService;
import org.vertx.java.core.Handler;
import org.vertx.java.core.json.JsonArray;
import org.vertx.java.core.json.JsonObject;

import fr.wseduc.webutils.Either;

public interface ResourceService extends CrudService {

	public void updateResource(final String id, final JsonObject data,
			final Handler<Either<String, JsonObject>> handler);

	public void getBookingOwnersIds(final long resourceId, final Handler<Either<String, JsonArray>> handler);

}