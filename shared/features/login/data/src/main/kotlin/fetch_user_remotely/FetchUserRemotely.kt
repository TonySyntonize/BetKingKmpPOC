package fetch_user_remotely

import models.DomainUser

interface FetchUserRemotely {
    suspend fun fetUserWithApi(): DomainUser
}