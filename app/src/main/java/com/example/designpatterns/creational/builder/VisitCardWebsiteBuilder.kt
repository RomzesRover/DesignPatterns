package com.example.designpatterns.creational.builder

class VisitCardWebsiteBuilder: WebsiteBuilder() {
    override fun buildName() {
        website.name = "visit card website"
    }

    override fun buildCms() {
        website.cms = Cms.WORDPRESS
    }

    override fun buildPrice() {
        website.price = 500
    }
}