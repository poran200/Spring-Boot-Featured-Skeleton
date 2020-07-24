package com.example.servicito.routing

class Route {
    class V1 {
        companion object {
            private const val API = "/api"
            private const val VERSION = "/v1"
            private const val ADMIN = "/admin"

            // Address API's
            const val SEARCH_ADDRESSES = "$API$VERSION/addresses"
            const val CREATE_ADDRESSES = "$API$VERSION/addresses"
            const val FIND_ADDRESSES = "$API$VERSION/addresses/{id}"
            const val UPDATE_ADDRESSES = "$API$VERSION/addresses/{id}"
            const val DELETE_ADDRESSES = "$API$VERSION/addresses/{id}"

            // Division API's
            const val SEARCH_DIVISION = "$API$VERSION/divisions"
            const val CREATE_DIVISION = "$API$VERSION/divisions"
            const val FIND_DIVISION = "$API$VERSION/divisions/{id}"
            const val UPDATE_DIVISION = "$API$VERSION/divisions/{id}"
            const val DELETE_DIVISION = "$API$VERSION/divisions/{id}"

            // District API's
            const val SEARCH_DISTRICT = "$API$VERSION/districts"
            const val CREATE_DISTRICT = "$API$VERSION/districts"
            const val FIND_DISTRICT = "$API$VERSION/districts/{id}"
            const val UPDATE_DISTRICT = "$API$VERSION/districts/{id}"
            const val DELETE_DISTRICT = "$API$VERSION/districts/{id}"

            // Upazila API's
            const val SEARCH_UPAZILA = "$API$VERSION/upazilas"
            const val CREATE_UPAZILA = "$API$VERSION/upazilas"
            const val FIND_UPAZILA = "$API$VERSION/upazilas/{id}"
            const val UPDATE_UPAZILA = "$API$VERSION/upazilas/{id}"
            const val DELETE_UPAZILA = "$API$VERSION/upazilas/{id}"

            // Union API's
            const val SEARCH_UNION = "$API$VERSION/unions"
            const val CREATE_UNION = "$API$VERSION/unions"
            const val FIND_UNION = "$API$VERSION/unions/{id}"
            const val UPDATE_UNION = "$API$VERSION/unions/{id}"
            const val DELETE_UNION = "$API$VERSION/unions/{id}"

            // Village API's
            const val SEARCH_VILLAGES = "$API$VERSION/villages"
            const val CREATE_VILLAGES = "$API$VERSION/villages"
            const val FIND_VILLAGES = "$API$VERSION/villages/{id}"
            const val UPDATE_VILLAGES = "$API$VERSION/villages/{id}"
            const val DELETE_VILLAGES = "$API$VERSION/villages/{id}"

            // Buildings API's
            const val SEARCH_BUILDINGS = "$API$VERSION/buildings"
            const val CREATE_BUILDINGS = "$API$VERSION/buildings"
            const val FIND_BUILDINGS = "$API$VERSION/buildings/{id}"
            const val UPDATE_BUILDINGS = "$API$VERSION/buildings/{id}"
            const val DELETE_BUILDINGS = "$API$VERSION/buildings/{id}"

            // Apartments API's
            const val SEARCH_APARTMENTS = "$API$VERSION/apartments"
            const val CREATE_APARTMENTS = "$API$VERSION/apartments"
            const val FIND_APARTMENTS = "$API$VERSION/apartments/{id}"
            const val UPDATE_APARTMENTS = "$API$VERSION/apartments/{id}"
            const val DELETE_APARTMENTS = "$API$VERSION/apartments/{id}"
            const val GET_APARTMENTS_FOR_BUILDING = "$API$VERSION/buildings/{building_id}/apartments"

            // Histories API's
            const val SEARCH_HISTORIES = "$API$VERSION$ADMIN/histories"

            // Roles
            const val WEB_RELOAD_APPLICATION_CONTEXT = "$ADMIN/roles/reload-applicatication-context"
            const val WEB_ROLES_PAGE = "$ADMIN/roles"
            const val WEB_ROLE_DETAILS_PAGE = "$ADMIN/roles/{role_id}"
            const val WEB_ROLE_CREATE = "$ADMIN/roles"
            const val WEB_ROLE_UPDATE = "$ADMIN/roles/{role_id}"

            // Privileges
            const val WEB_PRIVILEGES_PAGE = "$ADMIN/privileges"
            const val WEB_PRIVILEGE_CREATE = "$ADMIN/privileges"
            const val WEB_PRIVILEGE_DETAILS_PAGE = "$ADMIN/privileges/{privilege_id}"
            const val WEB_PRIVILEGE_UPDATE = "$ADMIN/privileges/{privilege_id}"

            // Users (Admin)
            const val WEB_USERS_SEARCH_PAGE = "$ADMIN/users"
            const val WEB_USERS_CREATE = "$ADMIN/users"
            const val WEB_USERS_DETAILS_PAGE = "$ADMIN/users/{user_id}"
            const val WEB_USERS_UPDATE = "$ADMIN/users/{user_id}"
            const val WEB_TOGGLE_ENABLED = "$ADMIN/users/{user_id}/toggle-access"

        }
    }
}