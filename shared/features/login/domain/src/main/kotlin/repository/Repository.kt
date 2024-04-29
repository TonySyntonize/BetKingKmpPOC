package repository

import models.DomainUser

interface Repository {

    suspend fun fetchUserRemotely(): DomainUser
}