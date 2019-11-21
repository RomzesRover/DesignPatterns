package com.example.designpatterns.creational.builder

class EnterpriseWebsiteBuilder: WebsiteBuilder() {
    override fun buildName() {
        website.name = "enterprise website"
    }

    override fun buildCms() {
        website.cms = Cms.ALIFRESCO
    }

    override fun buildPrice() {
        website.price = 1500
    }
}