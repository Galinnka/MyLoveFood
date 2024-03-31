package com.example.mylovefood.retrofit

import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class Repository @Inject constructor(
    remoteDataSourse: RemoteDataSourse,
){
    val remote = remoteDataSourse
}