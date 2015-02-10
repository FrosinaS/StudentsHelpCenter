'use strict';

angular.module('studentshelpcenterApp')
    .controller('QuestionVoteDetailController', function ($scope, $stateParams, QuestionVote, User, Question) {
        $scope.questionVote = {};
        $scope.load = function (id) {
            QuestionVote.get({id: id}, function(result) {
              $scope.questionVote = result;
            });
        };
        $scope.load($stateParams.id);
    });
