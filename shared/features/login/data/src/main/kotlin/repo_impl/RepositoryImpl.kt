package repo_impl

import fetch_user_remotely.FetchUserRemotely
import models.DomainUser
import repository.Repository

class RepositoryImpl(val fetchUserRemotely: FetchUserRemotely) : Repository {
    override suspend fun fetchUserRemotely(): DomainUser {
      return fetchUserRemotely.fetUserWithApi()
    }
}