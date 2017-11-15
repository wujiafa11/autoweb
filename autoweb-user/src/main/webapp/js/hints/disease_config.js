/**
 * INSPINIA - Responsive Admin Theme
 *
 * Inspinia theme use AngularUI Router to manage routing and views
 * Each view are defined as state.
 * Initial there are written state for all view in theme.
 *
 */
function config($stateProvider, $urlRouterProvider, $ocLazyLoadProvider, IdleProvider, KeepaliveProvider) {

    $stateProvider

        .state('hints', {
            abstract: true,
            url: "/hints",
            templateUrl: "views/common/content.html",
        })
        .state('hints.disease', {
            url: "/disease",
            templateUrl: "views/hints/disease.html",
            data: { pageTitle: '疾病数据' },
            controller:"listDiseaseCtrl",
            resolve: {
                loadPlugin: function ($ocLazyLoad) {
                    return $ocLazyLoad.load([
                        {
                            serie: true,
                            files: ['js/hints/disease_config.js','js/hints/disease_service.js','js/hints/disease_controller.js']
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
            }
        })

}