/**
 * INSPINIA - Responsive Admin Theme
 *
 * Inspinia theme use AngularUI Router to manage routing and views
 * Each view are defined as state.
 * Initial there are written state for all view in theme.
 *
 */
function config($stateProvider, $urlRouterProvider, $ocLazyLoadProvider, IdleProvider, KeepaliveProvider) {

    // Configure Idle settings
    IdleProvider.idle(5); // in seconds
    IdleProvider.timeout(120); // in seconds

    $urlRouterProvider.otherwise("/index/main");

    $ocLazyLoadProvider.config({
        // Set to true if you want to see what and when is dynamically loaded
        debug: false
    });

    $stateProvider

        .state('hints', {
            abstract: true,
            url: "/hints",
            templateUrl: "views/common/content.html",
        })
        .state('hints.disease', {
            url: "/hints_disease",
            templateUrl: "views/hints/disease.html",
            data: { pageTitle: '疾病数据' },
            // controller:"listDiseaseCtrl",
            resolve: {
                loadPlugin: function ($ocLazyLoad) {
                    return $ocLazyLoad.load([
                // deps:["$ocLazyLoad",function($ocLazyLoad){
                //     return $ocLazyLoad.load([
                        {
                            serie: true,
                            files: ['js/hints/disease_service.js','js/hints/disease_controller.js']
                        },
                        {
                            serie: true,
                            files: ['resources/js/plugins/dataTables/datatables.min.js','resources/css/plugins/dataTables/datatables.min.css']
                        },
                        {
                            serie: true,
                            name: 'datatables',
                            files: ['resources/js/plugins/dataTables/angular-datatables.min.js']
                        },
                        {
                            serie: true,
                            name: 'datatables.buttons',
                            files: ['resources/js/plugins/dataTables/angular-datatables.buttons.min.js']
                        }
                    ]);
                }
                // ]
            }

        })
        .state('index', {
            abstract: true,
            url: "/index",
            templateUrl: "views/common/content.html",
        })
        .state('index.main', {
            url: "/main",
            templateUrl: "views/main.html",
            data: { pageTitle: 'Example view' }
        })
        .state('index.minor', {
            url: "/minor",
            templateUrl: "views/minor.html",
            data: { pageTitle: 'Example view' }
        })
}
angular
    .module('inspinia')
    .config(config)
    .run(function($rootScope, $state) {
        $rootScope.$state = $state;
    });
