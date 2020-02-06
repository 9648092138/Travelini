package co.travelini.backendservices.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.travelini.backendservices.entity.LinkedSocialAccount;
import co.travelini.backendservices.repo.LinkedSocialAccountRepo;

@Service
public class LinkedSocialAccountService {

	@Autowired
	private LinkedSocialAccountRepo linkedAccountRepo;

	public Optional<LinkedSocialAccount> retrieveLinkedSocialAccount(String socialUserId) {
		return linkedAccountRepo.getLinkedAccountBySocialUserId(socialUserId);
	}

	public LinkedSocialAccount save(LinkedSocialAccount linkedAccount) {
		return this.linkedAccountRepo.save(linkedAccount);
	}
}
