package in.ashokit.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private Logger logger = 
			LoggerFactory.getLogger(UserService.class);

	public void saveUser() {
		logger.trace("this is trace msg");
		logger.debug("this is debug msg");
		logger.info("this is info msg");
		logger.warn("this is warn msg");
		logger.error("this is error msg");
	}

	public void deleteUser() {
		logger.debug("deleteUser() - execution started");
		try {
			// logic to delete user
			logger.info("User deleted successfully");
		} catch (Exception e) {
			logger.error("Exception : " + e.getMessage());
		}
		logger.debug("deleteUser() - execution completed");
	}
}
